package com.dailymission.api.springboot.web.dto.rabbitmq;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MessageDto {
    private Long id;
    private String type;
    private String dirName;
    private String fileName;
    private String extension;
    private String keyName;
    private String imageUrl;

    @Builder
    public MessageDto(Long id, String type, String dirName, String fileName, String extension, String keyName, String imageUrl){
        this.id = id;
        this.type =type;
        this.dirName = dirName;
        this.fileName = fileName;
        this.extension = extension;
        this.keyName = keyName;
        this.imageUrl = imageUrl;
    }
}
