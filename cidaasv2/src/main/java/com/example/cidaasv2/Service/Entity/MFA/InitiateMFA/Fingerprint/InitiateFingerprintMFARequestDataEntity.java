package com.example.cidaasv2.Service.Entity.MFA.InitiateMFA.Fingerprint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InitiateFingerprintMFARequestDataEntity implements Serializable{
   String deviceId;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
