package my.example.hourlyTimesheet;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseHourTimesheets {
	private String date;
	private List<HourTimesheetsItem> hourTimesheets;
}