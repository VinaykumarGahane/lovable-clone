package com.vinayGahane.lovable_clone.controller;

import com.vinayGahane.lovable_clone.dto.project.FileContentResponse;
import com.vinayGahane.lovable_clone.dto.project.FileNode;
import com.vinayGahane.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/projects/{projectId}/files")
@RequiredArgsConstructor
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/{*path}")
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId , @PathVariable String path){
        Long userId = 1L;
         return  ResponseEntity.ok(fileService.getFileContent(projectId,path,userId));
    }

}
