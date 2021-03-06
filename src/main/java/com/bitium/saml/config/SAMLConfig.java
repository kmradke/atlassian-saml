package com.bitium.saml.config;

import org.apache.commons.lang.StringUtils;

import com.atlassian.sal.api.pluginsettings.PluginSettings;
import com.atlassian.sal.api.pluginsettings.PluginSettingsFactory;

public class SAMLConfig {

    private PluginSettings pluginSettings;

    private String defaultBaseURL;

    public static final String ENTITY_ID_SETTING = "saml2.entityId";
    public static final String LOGIN_URL_SETTING = "saml2.loginUrl";
    public static final String LOGOUT_URL_SETTING = "saml2.logoutUrl";
    public static final String UID_ATTRIBUTE_SETTING = "salm2.uidAttribute";
    public static final String NAME_ATTRIBUTE_SETTING = "salm2.nameAttribute";
    public static final String MAIL_ATTRIBUTE_SETTING = "salm2.mailAttribute";
    public static final String X509_CERTIFICATE_SETTING = "saml2.x509Certificate";
    public static final String IDP_REQUIRED_SETTING = "saml2.idpRequired";
    public static final String REDIRECT_URL_SETTING = "saml2.redirectUrl";
    public static final String AUTO_CREATE_USER_SETTING = "saml2.autoCreateUser";
    public static final String AUTO_CREATE_USER_DEFAULT_GROUP_SETTING = "saml2.autoCreateUserDefaultGroup";

    public void setPluginSettingsFactory(PluginSettingsFactory pluginSettingsFactory) {
        this.pluginSettings = pluginSettingsFactory.createGlobalSettings();
    }

    public void setLoginUrl(String loginUrl) {
        pluginSettings.put(LOGIN_URL_SETTING, loginUrl);
    }

    public void setLogoutUrl(String logoutUrl) {
        pluginSettings.put(LOGOUT_URL_SETTING, logoutUrl);
    }

    public void setEntityId(String entityId) {
        pluginSettings.put(ENTITY_ID_SETTING, entityId);
    }

    public void setUidAttribute(String uidAttribute) {
        pluginSettings.put(UID_ATTRIBUTE_SETTING, uidAttribute);
    }

    public void setNameAttribute(String nameAttribute) {
        pluginSettings.put(NAME_ATTRIBUTE_SETTING, nameAttribute);
    }

    public void setMailAttribute(String mailAttribute) {
        pluginSettings.put(MAIL_ATTRIBUTE_SETTING, mailAttribute);
    }

    public void setX509Certificate(String x509Certificate) {
        pluginSettings.put(X509_CERTIFICATE_SETTING, x509Certificate);
    }

    public void setIdpRequired(String idpRequired) {
        pluginSettings.put(IDP_REQUIRED_SETTING, idpRequired);
    }

    public void setRedirectUrl(String redirectUrl) {
        pluginSettings.put(REDIRECT_URL_SETTING, redirectUrl);
    }

    public void setAutoCreateUser(String autoCreateUser) {
        pluginSettings.put(AUTO_CREATE_USER_SETTING, autoCreateUser);
    }

    public void setAutoCreateUserDefaultGroup(String autoCreateUserDefaultGroup) {
        pluginSettings.put(AUTO_CREATE_USER_DEFAULT_GROUP_SETTING, autoCreateUserDefaultGroup);
    }

    public String getIdpRequired() {
        return StringUtils.defaultString((String)pluginSettings.get(IDP_REQUIRED_SETTING));
    }

    public boolean getIdpRequiredFlag() {
        if (StringUtils.defaultString((String)pluginSettings.get(IDP_REQUIRED_SETTING)).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public String getAutoCreateUser() {
        return StringUtils.defaultString((String)pluginSettings.get(AUTO_CREATE_USER_SETTING));
    }

    public boolean getAutoCreateUserFlag() {
        if (StringUtils.defaultString((String)pluginSettings.get(AUTO_CREATE_USER_SETTING)).equals("true")) {
            return true;
        } else {
            return false;
        }
    }

    public String getAutoCreateUserDefaultGroup() {
        return StringUtils.defaultString((String)pluginSettings.get(AUTO_CREATE_USER_DEFAULT_GROUP_SETTING));
    }

    public String getLoginUrl() {
        return StringUtils.defaultString((String)pluginSettings.get(LOGIN_URL_SETTING));
    }

    public String getLogoutUrl() {
        return StringUtils.defaultString((String)pluginSettings.get(LOGOUT_URL_SETTING));
    }

    public String getIdpEntityId() {
        return StringUtils.defaultString((String)pluginSettings.get(ENTITY_ID_SETTING));
    }

    public String getUidAttribute() {
        return StringUtils.defaultString((String)pluginSettings.get(UID_ATTRIBUTE_SETTING), "NameID");
    }

    public String getNameAttribute() {
        return StringUtils.defaultString((String)pluginSettings.get(NAME_ATTRIBUTE_SETTING), "cn");
    }

    public String getMailAttribute() {
        return StringUtils.defaultString((String)pluginSettings.get(MAIL_ATTRIBUTE_SETTING), "mail");
    }

    public String getX509Certificate() {
        return StringUtils.defaultString((String)pluginSettings.get(X509_CERTIFICATE_SETTING));
    }

    public String getRedirectUrl() {
        return StringUtils.defaultString((String)pluginSettings.get(REDIRECT_URL_SETTING));
    }

    public void setDefaultBaseUrl(String defaultBaseURL) {
        this.defaultBaseURL = defaultBaseURL;
    }

    public String getAlias() {
        return "confluenceSAML";
    }

    public String getBaseUrl() {
        return StringUtils.defaultString(defaultBaseURL);
    }

    public String getSpEntityId() {
        return defaultBaseURL + "/" + getAlias();
    }
}
