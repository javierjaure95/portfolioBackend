package com.foroclone.foroclone.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PostDto {
    
    private Long id;

    private String title;

    private String content;

    private LocalDateTime createdAt;

    private CommunityDto community;

    private UserDto creator;

}