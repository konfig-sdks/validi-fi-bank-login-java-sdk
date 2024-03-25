<div align="left">

[![Visit Validifi](./header.png)](https://validifi.com&#x2F;)

# [Validifi](https://validifi.com&#x2F;)

ValidiFI, an analytics and technology company, connects bank account and payment insights to help companies in a variety of industries provide more confident, trustworthy and transparent transactions. Our differentiated data, sourced directly from banks, payment processors, and financial platforms helps companies to ensure compliance, mitigate risk, combat fraud, and confidently validate bank account and ownership. For more information, visit ValidiFI.com.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=ValidiFI&serviceName=BankLogin&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>validi-fi-bank-login-java-sdk</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:validi-fi-bank-login-java-sdk:1.0.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/validi-fi-bank-login-java-sdk-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.ValidiFiBankLogin;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ConnectApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://}";
    ValidiFiBankLogin client = new ValidiFiBankLogin(configuration);
    String search = "{{routingNumber}}";
    try {
      client
              .connect
              .bankLookup()
              .search(search)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#bankLookup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connect
              .bankLookup()
              .search(search)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#bankLookup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://}*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ConnectApi* | [**bankLookup**](docs/ConnectApi.md#bankLookup) | **GET** /v4/CONNECT/Banks | Bank Lookup
*ConnectApi* | [**createSession**](docs/ConnectApi.md#createSession) | **POST** /v4/CONNECT/Session | CONNECT Session
*ConnectApi* | [**getFullAccountInfo**](docs/ConnectApi.md#getFullAccountInfo) | **GET** /v4/accounts/{accountToken}/export | Get Full Account Info from CONNECT Session
*InsightsApi* | [**getInsightById**](docs/InsightsApi.md#getInsightById) | **GET** /v4/Insights/2/{inquiryId} | Get Insights
*InsightsApi* | [**submitLoanApplication**](docs/InsightsApi.md#submitLoanApplication) | **POST** /v4/Insights | BankQUALIFY
*ReportsApi* | [**submitAffordAi**](docs/ReportsApi.md#submitAffordAi) | **POST** /v4/affordai | AffordAi
*TokenApi* | [**checkHealth**](docs/TokenApi.md#checkHealth) | **GET** /v4/HealthCheck | Health Check
*TokenApi* | [**create**](docs/TokenApi.md#create) | **POST** /v4/token | OAuth 2.0 Token


## Documentation for Models

 - [TokenCreateRequest](docs/TokenCreateRequest.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
