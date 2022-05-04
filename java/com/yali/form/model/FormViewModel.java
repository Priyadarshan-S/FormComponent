package main.java.com.yali.form.model;

import java.util.List;

import com.zoho.yali.conf.YConfig;
import com.zoho.yali.view.ViewContext;
import com.zoho.yali.view.ViewModel;

public class FormViewModel extends ViewModel {

    public FormViewModel(ViewContext viewContext, YConfig uiControlConfig) {
        super(viewContext, uiControlConfig);
    }
 
    private String title;
    private String description;
    private Boolean access;
    private List<YConfig> fieldList;
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    public List<YConfig> getFieldList(){
        return fieldList;
    }

    public void addFieldList(YConfig config) {
        this.fieldList.add(config);
    }
}
