package main.java.com.yali.form.controller;

import com.zoho.yali.conf.YConfig;
import com.zoho.yali.conf.YConfigFactory;
import com.zoho.yali.ds.DSContext;
import com.zoho.yali.view.ViewContext;
import com.zoho.yali.view.ViewController;
import com.zoho.yali.view.ViewModel;
import com.zoho.yali.view.ViewModelConstructionException;

import main.java.com.yali.form.controller.helper.FieldChecks;
import main.java.com.yali.form.controller.helper.Login;
import main.java.com.yali.form.controller.helper.UserConfigurations;
import main.java.com.yali.form.model.FormViewModel;

public class FormViewController extends ViewController{

    public FormViewController(YConfig uiControlConfig) {
        super(uiControlConfig);
    }

    @Override
    public ViewModel getViewModel(ViewContext viewContext, DSContext arg1) throws ViewModelConstructionException {
        UserConfigurations userConfig = new UserConfigurations(YConfigFactory.getConfig(), viewContext);


        return getFormViewModel(viewContext,userConfig);
    }

    public FormViewModel getFormViewModel(ViewContext viewContext,UserConfigurations userConfig) {
        FormViewModel model = new FormViewModel(viewContext, uiControlConfig());
        model.setTitle(userConfig.getTitle());
        model.setDescription(userConfig.getDescription());
        model.setAccess(userConfig.getAccess());
        
        Login login = new Login();
        String role = login.getRole();
        
        model.getFieldList().forEach(field ->{
            String fieldType = obj.getString("fieldType");
            FieldChecks check = new FieldChecks();
            if(check.RoleCheck(role,obj.getString("role")))
            {
            }
        });
        return model;
    }
    
}
