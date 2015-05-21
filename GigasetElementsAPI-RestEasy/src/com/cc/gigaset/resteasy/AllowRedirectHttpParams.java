package com.cc.gigaset.resteasy;

import org.apache.http.client.params.ClientPNames;
import org.apache.http.params.HttpParams;

@SuppressWarnings("deprecation")
public class AllowRedirectHttpParams
	implements HttpParams {

    private final HttpParams delegate;

    public AllowRedirectHttpParams(HttpParams delegate) {
	this.delegate = delegate;
    }

    @Override
    public Object getParameter(String name) {
	return delegate.getParameter(name);
    }

    @Override
    public HttpParams setParameter(String name, Object value) {
	return delegate.setParameter(name, value);
    }

    @Override
    public HttpParams copy() {
	return delegate.copy();
    }

    @Override
    public boolean removeParameter(String name) {
	return delegate.removeParameter(name);
    }

    @Override
    public long getLongParameter(String name, long defaultValue) {
	return delegate.getLongParameter(name, defaultValue);
    }

    @Override
    public HttpParams setLongParameter(String name, long value) {
	return delegate.setLongParameter(name, value);
    }

    @Override
    public int getIntParameter(String name, int defaultValue) {
	return delegate.getIntParameter(name, defaultValue);
    }

    @Override
    public HttpParams setIntParameter(String name, int value) {
	return delegate.setIntParameter(name, value);
    }

    @Override
    public double getDoubleParameter(String name, double defaultValue) {
	return delegate.getDoubleParameter(name, defaultValue);
    }

    @Override
    public HttpParams setDoubleParameter(String name, double value) {
	return delegate.setDoubleParameter(name, value);
    }

    @Override
    public boolean getBooleanParameter(String name, boolean defaultValue) {
	if (ClientPNames.HANDLE_REDIRECTS.equals(name)) {
	    return true;
	}
	return delegate.getBooleanParameter(name, defaultValue);
    }

    @Override
    public HttpParams setBooleanParameter(String name, boolean value) {
	return delegate.setBooleanParameter(name, value);
    }

    @Override
    public boolean isParameterTrue(String name) {
	return delegate.isParameterTrue(name);
    }

    @Override
    public boolean isParameterFalse(String name) {
	return delegate.isParameterFalse(name);
    }
}