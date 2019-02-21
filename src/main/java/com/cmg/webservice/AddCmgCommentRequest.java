package com.cmg.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="addCMGComment",namespace="urn:CMGCommentService/types")
public class AddCmgCommentRequest {

    @XmlElement(required = true,name="String_1",nillable=true )
    private String gabsKey;
    public String getGabsKey() {
        return gabsKey;
    }
    @XmlElement(required=true,name="String_2",nillable=true)
    private String comment;
    
   public void setGabsKey(String gabsKey) {
        this.gabsKey = gabsKey;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
    
}
