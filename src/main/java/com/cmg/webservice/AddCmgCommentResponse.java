package com.cmg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "addCmgCommentResponse")
public class AddCmgCommentResponse {

    @XmlElement(name="result",nillable=true)
    private String response;

    public AddCmgCommentResponse() {
     
    }
    
    public AddCmgCommentResponse(String response) {
        this.response=response;
    }
    
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
    
    
    
    
}
