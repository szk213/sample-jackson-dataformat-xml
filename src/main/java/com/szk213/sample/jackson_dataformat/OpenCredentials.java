package com.szk213.sample.jackson_dataformat;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "open")
class OpenCredentials {

    @JacksonXmlProperty(localName = "creds")
    @JacksonXmlElementWrapper(useWrapping = false)
    private Credentials[] credentials;
}

