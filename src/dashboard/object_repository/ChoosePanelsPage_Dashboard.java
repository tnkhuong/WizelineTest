package dashboard.object_repository;

import org.openqa.selenium.By;

public class ChoosePanelsPage_Dashboard {
	 public By choose_panels_label=By.className("phead");
	 public By charts_label=By.cssSelector("div.ptit.pchart");
	 public By indicators_label= By.cssSelector("div.ptit.pindicator");
	 public By reports_label=By.xpath("//div[@class='ptit preport' and text()='Reports']");
	 public By heatmaps_label= By.xpath("//div[@class='ptit preport' and text()='Heat Maps']");
}
