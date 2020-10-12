package com.JZhi.mqtt.config;

import lombok.Data;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.mqtt.core.DefaultMqttPahoClientFactory;
import org.springframework.integration.mqtt.core.MqttPahoClientFactory;

@Data
public class MqttConfig {
    @Value("${spring.mqtt.host}")
    public   String host ;
    @Value("${spring.mqtt.topic}")
    public  String topic;
    @Value("${spring.mqtt.username}")
    private  String username;
    @Value("${spring.mqtt.password}")
    private  String password ;
    @Value("${spring.mqtt.clientId}")
    private String clientId;
    @Value("${spring.mqtt.keepAlive}")
    private int keepAlive;
    @Value("${spring.mqtt.reconnect}")
    private boolean reconnect;
    @Value("${spring.mqtt.timeout}")
    private int timeout;

    @Bean
    public MqttConnectOptions getMqttConnectOptions() {
        MqttConnectOptions mqttConnectOptions = new MqttConnectOptions();
        mqttConnectOptions.setCleanSession(true);   //清除session
        mqttConnectOptions.setConnectionTimeout(timeout); //连接超时
        mqttConnectOptions.setUserName(username);   //登录名
        mqttConnectOptions.setPassword(password.toCharArray()); //密码
        mqttConnectOptions.setServerURIs(new String[]{host});   //服务器地址
        mqttConnectOptions.setKeepAliveInterval(keepAlive); //心跳时间,单位秒
        mqttConnectOptions.setAutomaticReconnect(reconnect); //自动重连
        return mqttConnectOptions;
    }

    @Bean
    public MqttPahoClientFactory mqttClientFactory() {
        DefaultMqttPahoClientFactory factory = new DefaultMqttPahoClientFactory();
        factory.setConnectionOptions(getMqttConnectOptions());
        return factory;
    }
}
