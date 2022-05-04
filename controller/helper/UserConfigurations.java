package main.java.com.yali.form.controller.helper;

import com.zoho.yali.conf.YConfig;
import com.zoho.yali.view.ViewContext;

import java.util.List;

public class UserConfigurations {
    //Class holds the data provided by user in YC config file
    private YConfig userViewConfiguration;
    private String title;
    private String description;
    private Boolean access;
    private List<YConfig> fields;

    public UserConfigurations(YConfig config, ViewContext viewContext){
        this.userViewConfiguration = config.getConfig("view").getConfig(viewContext.viewName());
        this.fields = this.userViewConfiguration.getConfigList("fields");
        this.title = this.userViewConfiguration.getString("title");
        this.description = this.userViewConfiguration.getString("instruction");
        this.access = this.userViewConfiguration.getBoolean("access");
    }

    public YConfig getUserViewConfiguration() {
        return userViewConfiguration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAccess() {
        return access;
    }

    public List<YConfig> getFields() {
        return fields;
    }
}
