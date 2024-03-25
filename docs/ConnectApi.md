# ConnectApi

All URIs are relative to *https://}*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**bankLookup**](ConnectApi.md#bankLookup) | **GET** /v4/CONNECT/Banks | Bank Lookup |
| [**createSession**](ConnectApi.md#createSession) | **POST** /v4/CONNECT/Session | CONNECT Session |
| [**getFullAccountInfo**](ConnectApi.md#getFullAccountInfo) | **GET** /v4/accounts/{accountToken}/export | Get Full Account Info from CONNECT Session |


<a name="bankLookup"></a>
# **bankLookup**
> bankLookup().search(search).execute();

Bank Lookup

Bank Lookup

### Example
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

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **search** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="createSession"></a>
# **createSession**
> createSession().body(body).execute();

CONNECT Session

CONNECT Session

### Example
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
    try {
      client
              .connect
              .createSession()
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connect
              .createSession()
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#createSession");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **body** | **Object**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

<a name="getFullAccountInfo"></a>
# **getFullAccountInfo**
> getFullAccountInfo(accountToken).execute();

Get Full Account Info from CONNECT Session

Get Full Account Info from CONNECT Session

### Example
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
    String accountToken = "accountToken_example";
    try {
      client
              .connect
              .getFullAccountInfo(accountToken)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#getFullAccountInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      client
              .connect
              .getFullAccountInfo(accountToken)
              .executeWithHttpInfo();
    } catch (ApiException e) {
      System.err.println("Exception when calling ConnectApi#getFullAccountInfo");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **accountToken** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

