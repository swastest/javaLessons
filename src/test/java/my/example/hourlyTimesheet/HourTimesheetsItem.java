package my.example.hourlyTimesheet;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HourTimesheetsItem{
	private List<Object> busyExecutors;
	private Integer startHour;
	private List<Object> freeExecutors;
}