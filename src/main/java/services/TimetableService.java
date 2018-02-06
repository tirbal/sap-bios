package services;

import org.openqa.selenium.WebDriver;

public class TimetableService extends BaseService {


    public TimetableService(WebDriver driver) {
        super(driver);
    }

    String url ="https://my335712.sapbydesign.com/sap/public/ap/ui/repository/SAP_UI/HTMLOBERON5/client.html?client_type=html&app.component=/SAP_UI_CT/Main/root.uiccwoc&rootWindow=X&redirectUrl=/sap/public/ap/ui/runtime#n=eyJpblBvcnQiOiJFZGl0VGltZVNoZWV0RVRSViIsInRhcmdldCI6Ii9TQVBfQllEX0FQUExJQ0FUSU9OX1VJL2hjbS90aW0vVGltZVNoZWV0X1FBRi5RQS51aWNvbXBvbmVudCIsInBhcmFtcyI6e30sImxpc3RzIjp7fSwid2NDb250ZXh0Ijp7IndvY0lkIjoiIiwidmlld0lkIjoiL1NBUF9CWURfVUlfQ0NXT0MvQ0MvU2VsZlNlcnZpY2UvU2VsZlNlcnZpY2VzVmlldy5XQ1ZJRVcudWl3b2N2aWV3IiwiaXNOYXZOb2RlIjpmYWxzZSwibmF2Tm9kZVRleHQiOiIifX0%3D";

    @Override
    public boolean launch() {

        driver.get(this.url);
        return false;
    }
}
