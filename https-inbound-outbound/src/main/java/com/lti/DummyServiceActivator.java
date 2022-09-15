package com.lti;

import java.util.LinkedHashMap;

public class DummyServiceActivator {

  public void dummyMethod(LinkedHashMap<String, String> payload) {
    System.out.println(payload +" ### Successfully received inbound request ###");

  }
  public void dummyOutboundMethod(LinkedHashMap<String, String> payload) {
    System.out.println(payload +" ### Successfully received outbound request ###");

  }

}