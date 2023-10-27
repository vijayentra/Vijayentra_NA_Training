package com.restaurant.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.*;
import lombok.Data;



@Data
public class BookTable {
    private String bookingId;

    @NotNull(message = "Provide value for customer name")
    private String customerName;
    
    private String mobileNumber;
    private Integer totalGuestCount;

    @Min(value = 0, message = "Provide value greater than or equal to zero")
    private Integer totalAdultVegCount;

    @Min(value = 0, message = "Provide value greater than or equal to zero")
    private Integer totalAdultNonVegCount;

    @Min(value = 0, message = "Provide value greater than or equal to zero")
    private Integer totalKidsVegCount;

    @Min(value = 0, message = "Provide value greater than or equal to zero")
    private Integer totalKidsNonVegCount;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Provide correct format")
    private LocalDate bookingDate;

    private Double totalBillAmount;
	
	
	public BookTable(String bookingId, String customerName, String mobileNumber, Integer totalGuestCount,
			Integer totalAdultVegCount, Integer totalAdultNonVegCount, Integer totalKidsVegCount,
			Integer totalKidsNonVegCount, LocalDate bookingDate, Double totalBillAmount) {
		super();
		this.bookingId = bookingId;
		this.customerName = customerName;
		this.mobileNumber = mobileNumber;
		this.totalGuestCount = totalGuestCount;
		this.totalAdultVegCount = totalAdultVegCount;
		this.totalAdultNonVegCount = totalAdultNonVegCount;
		this.totalKidsVegCount = totalKidsVegCount;
		this.totalKidsNonVegCount = totalKidsNonVegCount;
		this.bookingDate = bookingDate;
		this.totalBillAmount = totalBillAmount;
	}
	
	
	public BookTable() {
		
	}
	
	
	
	
	

}
