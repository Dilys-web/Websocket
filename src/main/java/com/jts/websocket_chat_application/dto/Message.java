package com.jts.websocket_chat_application.dto;


import com.jts.websocket_chat_application.Enums.MsgType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Message {

    private MsgType type;
    private String content;
    private String sender;
    private String receiver;

}
