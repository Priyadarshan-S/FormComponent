package main.java.com.yali.form.model.submodels;

import java.util.ArrayList;
import java.util.List;

import com.zoho.yali.conf.YConfig;

public class ChoiceFldViewModel extends ConstantFields{
    int choiceCount,choiceLimit;
    List<String> choiceArray = new ArrayList<>();
    
    public ChoiceFldViewModel(YConfig config) {
        super(config);
        this.choiceCount = config.getInt("choiceCount");
        this.choiceLimit = config.getInt("choiceLimit");
        this.choiceArray = config.getStringList("choiceArray");
    }

    public int getChoiceCount() {
        return choiceCount;
    }

    public int getChoiceLimit() {
        return choiceLimit;
    }

    public List<String> getChoiceArray() {
        return choiceArray;
    }

}
