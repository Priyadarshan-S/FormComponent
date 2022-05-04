package main.java.com.yali.form;

import com.zoho.yali.exception.YException;
import com.zoho.yali.view.*;

import com.zoho.yali.view.writer.VMStreamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(
        name = "ViewResponse",
        urlPatterns = {"/"}
)
public class ViewResponse extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Sample servlet
        String viewName = req.getParameter("viewName");
        ViewContext context;
        try {
            context = ViewContext.newBuilder()
                    .withViewName(viewName)
                    .withMode("web")
                    .withFormat("json")
                    .withViewParams(
                            ViewParams.newBuilder().build()
                    )
                    .build();
        } catch (YException e) {
            throw new ServletException("Exception occurred when trying to build the context", e);
        }
        ViewModel model;
        try {
            model = ViewManager.getViewModel(context);
        } catch (ViewModelConstructionException e) {
            throw new ServletException(e);
        }

        try (OutputStream output = resp.getOutputStream()){
            model.write(null,output);
        } catch (VMStreamingException e) {
            throw new ServletException(e);
        }

    }
}