package main.java.com.yali.form.model.submodels;

import com.zoho.yali.conf.YConfig;

public class ConstantFields {
    String title,instruction,visibility,mandatory;

    public ConstantFields(YConfig config) {
        this.title = config.getString("title");
        this.instruction = config.getString("instruction");
        this.visibility = config.getString("visibility");
        this.mandatory = config.getString("mandatory");
    }

    public String getTitle() {
        return title;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getVisibility() {
        return visibility;
    }

    public String getMandatory() {
        return mandatory;
    }
}
