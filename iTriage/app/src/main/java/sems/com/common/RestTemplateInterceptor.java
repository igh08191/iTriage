package sems.com.common;

import android.util.Log;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class RestTemplateInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] data,
                                        ClientHttpRequestExecution execution) throws IOException
    {
        ClientHttpResponse response = null;

        try
        {
            prepareRequest(httpRequest);
        }
        catch(Exception ex)
        {
            Log.e("traceRequest", new StringBuilder("Excepción preparando request: ").append(ex).toString());
        }

        try
        {
            traceRequest((ClientHttpRequest)httpRequest, data);

            response = execution.execute(httpRequest, data);

            traceResponse(response);
        }
        catch(Exception ex)
        {
            traceException(ex);
        }

        return response;
    }

    protected void prepareRequest(HttpRequest httpRequest)
    {
        //modify the request
    }

    protected void traceRequest(ClientHttpRequest request, byte[] data) throws IOException
    {
        try
        {
            Log.d("traceRequest", "============================request begin==========================================");
            Log.d("traceRequest", new StringBuilder("URI      : ").append(request.getURI()).toString());
            Log.d("traceRequest", new StringBuilder("Headers      : ").append(request.getHeaders()).toString());
            Log.d("traceRequest", new StringBuilder("Request body: ").append(new String(data,"UTF-8")).toString());
            Log.d("traceRequest", new StringBuilder("=======================request end=================================================").toString());
        }
        catch(Exception ex)
        {
            Log.e("traceRequest", new StringBuilder("Excepción trazando request: ").append(ex).toString(), ex);
        }
    }

    protected void traceResponse(ClientHttpResponse response) throws IOException
    {
        try
        {
            StringBuilder inputStringBuilder = getResponseMessage(response);

            Log.d("traceResponse", "============================response begin==========================================");
            Log.d("traceResponse", new StringBuilder("Status code  : ").append(response.getStatusCode()).toString());
            Log.d("traceResponse",new StringBuilder("Status text  : ").append(response.getStatusText()).toString());
            Log.d("traceResponse",new StringBuilder("Headers      : ").append(response.getHeaders()).toString());
            Log.d("traceResponse",new StringBuilder("Response body: ").append(inputStringBuilder.toString()).toString());
            Log.d("traceResponse",new StringBuilder("=======================response end=================================================").toString());
        }
        catch(Exception ex)
        {
            Log.e("traceResponse", new StringBuilder("Excepción trazando response: ").append(ex).toString(), ex);
        }
    }

    protected void traceException(Exception ex) throws IOException
    {
        try
        {
            Log.e("traceException", new StringBuilder("Excepción enviando request: ").append(ex).toString(), ex);
        }
        catch(Exception e)
        {
            Log.e("traceException", new StringBuilder("Excepción trazando excepción: ").append(e).toString(), e);
        }
    }

    protected StringBuilder getResponseMessage(ClientHttpResponse response)
            throws UnsupportedEncodingException, IOException
    {
        StringBuilder inputStringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getBody(), "UTF-8"));
        String line = bufferedReader.readLine();
        while (line != null) {
            inputStringBuilder.append(line);
            inputStringBuilder.append('\n');
            line = bufferedReader.readLine();
        }
        return inputStringBuilder;
    }}
