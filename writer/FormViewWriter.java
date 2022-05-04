package main.java.com.yali.form.writer;

import com.zoho.yali.view.ViewModelWriter;
import com.zoho.yali.view.ViewModel;
import com.zoho.yali.view.VMWriterContext;
import main.java.com.yali.form.model.FormViewModel;

import java.io.IOException;
import java.io.OutputStream;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FormViewWriter implements ViewModelWriter {

    /**
     * Writes the data held by the CalendarModel instance to the given
     * OutputStream in JSON format.
     *
     * @param viewModel an {@link CalendardModel} that needs to be written
     * @param vmWriterContext a context to pass additional information to
     *                       the writer. Not used here.
     * @param outputStream the output stream to which the model needs to
     *                     be written
     * @throws VMStreamingException exception thrown in case issues when
     *         trying to write the model
     */
    @Override
    public void write(ViewModel viewModel, VMWriterContext vmWriterContext, OutputStream outputStream) {
        if (viewModel instanceof FormViewModel) {
            ObjectMapper objectMapper = new ObjectMapper();

            try {
                objectMapper.writeValue(outputStream, viewModel);
            } catch (JsonGenerationException e) {
                e.printStackTrace();
            } catch (JsonMappingException e) {
                e.printStackTrace();            
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}