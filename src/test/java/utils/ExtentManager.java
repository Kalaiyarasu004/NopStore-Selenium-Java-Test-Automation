package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    static ExtentReports extent;

    public static ExtentReports getReport() {

        if (extent == null) {

            ExtentSparkReporter reporter =
                    new ExtentSparkReporter(
                            "reports/AutomationReport.html"
                    );

            reporter.config()
                    .setReportName(
                            "Selenium Automation Report"
                    );

            extent = new ExtentReports();

            extent.attachReporter(reporter);

            extent.setSystemInfo(
                    "Tester",
                    "Kalaiyarasu"
            );
        }

        return extent;
    }
}