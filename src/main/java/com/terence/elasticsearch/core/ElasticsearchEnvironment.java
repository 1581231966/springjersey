package com.terence.elasticsearch.core;

public class ElasticsearchEnvironment {
	private String host;
	private int port;
	private int connectTimeout;
	private int socketTimeout;

	public ElasticsearchEnvironment(String host,int port,int connectTimeout, int socketTimeouot){
		this.host = host;
		this.port = port;
		this.connectTimeout = connectTimeout;
		this.socketTimeout = socketTimeouot;
	}
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public int getConnectTimeout() {
		return connectTimeout;
	}

	public void setConnectTimeout(int connectTimeout) {
		this.connectTimeout = connectTimeout;
	}

	public int getSocketTimeouot() {
		return socketTimeout;
	}

	public void setSocketTimeouot(int socketTimeouot) {
		this.socketTimeout = socketTimeouot;
	}
}
