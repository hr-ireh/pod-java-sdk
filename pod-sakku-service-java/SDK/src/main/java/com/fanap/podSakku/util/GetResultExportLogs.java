package com.fanap.podSakku.util;

import com.fanap.podSakku.exception.PodException;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.*;

public class GetResultExportLogs {

    private OnGetResponseListenerExportLogs onGetResponseListener;
    private Call<ResponseBody> call;
    private String responseBody;
    private JSONObject jsonObject;

    public GetResultExportLogs(Call<ResponseBody> call, OnGetResponseListenerExportLogs onGetResponseListener) {
        this.call = call;
        this.onGetResponseListener = onGetResponseListener;
    }

    public void get() {
        if (onGetResponseListener != null) {
            call.enqueue(new Callback<ResponseBody>() {

                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    int statusCode = response.code();
                    if (statusCode == 200) {
                        writeResponseBodyToDisk(response.body());
//                        Log.d("File download was a success? ", String.valueOf(writtenToDisk));

                    } else {
                        try {
                            responseBody = response.errorBody().string();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        jsonObject = JsonUtil.getJsonObject(responseBody);
                        onGetResponseListener.onFailed(
                                PodException.developerException((int) jsonObject.get("status"),
                                        jsonObject.get("message").toString()));
                    }

                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                    if (onGetResponseListener != null)
                        onGetResponseListener.onFailed(PodException.unexpectedException());
                }
            });
        }
    }


    private boolean writeResponseBodyToDisk(ResponseBody body) {
        try {
            // todo change the file location/name according to your needs
            File futureStudioIconFile = new File("logs.txt");

            InputStream inputStream = null;
            OutputStream outputStream = null;

            try {
                byte[] fileReader = new byte[4096];

                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(futureStudioIconFile);

                while (true) {
                    int read = inputStream.read(fileReader);

                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);

                    fileSizeDownloaded += read;

//                    Log.d("File Download: " , fileSizeDownloaded + " of " + fileSize);
                }

                outputStream.flush();
                System.out.println("it saved in logs.txt");
                return true;
            } catch (IOException e) {
                return false;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }

                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            return false;
        }
    }

}
