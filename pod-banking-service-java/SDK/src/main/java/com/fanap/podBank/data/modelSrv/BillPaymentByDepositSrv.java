package com.fanap.podBank.data.modelSrv;

import com.fanap.podBaseService.exception.PodException;
import com.fanap.podBaseService.util.JsonUtil;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class BillPaymentByDepositSrv {


    private String result;
    private Header header;
    private long statusCode;
    private JSONObject jsonObject;

    public BankingResult<String> getResult() throws PodException {
        DocumentBuilder db = null;
        try {
            db = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        InputSource is = new InputSource();
        is.setCharacterStream(new StringReader(result));
        Document doc = null;
        try {
            doc = db.parse(is);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String ss = doc.getElementsByTagName("BillPaymentByDepositResult").item(0).getTextContent();
        jsonObject = JsonUtil.getJsonObject(ss);
        ObjectMapper mapper = new ObjectMapper();
        BankingResult<String> bankingResult = null;
        try {
            bankingResult = mapper.readValue(jsonObject.toString(), new TypeReference<BankingResult<String>>() {
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (bankingResult.getIsSuccess() == false)
            throw PodException.developerException(bankingResult.getMessageCode(), bankingResult.getMessage());
        return bankingResult;
    }


    public void setResult(String result) {
        this.result = result;
    }


    public Header getHeader() {
        return header;
    }


    public void setHeader(Header header) {
        this.header = header;
    }


    public long getStatusCode() {
        return statusCode;
    }


    public void setStatusCode(long statusCode) {
        this.statusCode = statusCode;
    }


}
