package com.cookbook.mappers;

import com.cookbook.DTOs.CommentDTO;
import com.cookbook.DTOs.SimpleCommentDTO;
import com.cookbook.entities.CommentEntity;

public class CommentMapper {

    public static CommentDTO toDTO(CommentEntity entity) {
        CommentDTO dto = new CommentDTO();

        dto.setId(entity.getId());
        dto.setContent(entity.getContent());

        return dto;
    }

    public static CommentEntity toEntity(CommentDTO dto) {
        CommentEntity entity = new CommentEntity();

        entity.setContent(dto.getContent());

        return entity;
    }

    public static SimpleCommentDTO toSimpleDTO(CommentEntity entity) {
        SimpleCommentDTO simpleDTO = new SimpleCommentDTO();

        simpleDTO.setContent(entity.getContent());
        simpleDTO.setAuthorUserName(entity.getAuthor().getUserName());

        return simpleDTO;
    }
}
