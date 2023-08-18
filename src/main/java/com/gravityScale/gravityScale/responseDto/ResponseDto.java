package com.gravityScale.gravityScale.responseDto;


import lombok.Data;

@Data
public class ResponseDto {
	
	private int status;
    private String message;
    private Object data;
    private String error;

//    public ResponseDto(int status, String message, Object data){
//		this.status = status;
//		this.message = message;
//		this.data = data;
//		
//	}
//    
//    public ResponseDto(int status, Object data, String error){
//		this.status = status;
//		this.message = error;
//		this.data = data;
//		
//	}

}
