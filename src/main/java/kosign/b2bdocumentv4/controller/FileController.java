package kosign.b2bdocumentv4.controller;

import kosign.b2bdocumentv4.entity.doc_articles.DocumentArticles;
import kosign.b2bdocumentv4.entity.doc_file.DocumentFile;
import kosign.b2bdocumentv4.exception.NotFoundExceptionClass;
import kosign.b2bdocumentv4.payload.BaseResponse;
import kosign.b2bdocumentv4.payload.login.response.ApiResponse;
import kosign.b2bdocumentv4.service.doc_file.FileServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
@CrossOrigin
public class FileController {
    private final FileServiceImpl fileService;
    @Value("${file_path}")
    private String file_path;

    public FileController(FileServiceImpl fileService) {
        this.fileService = fileService;
    }

    @PostMapping(value = "/upload_file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<ApiResponse> fileUpload(@RequestParam MultipartFile imageFile, @RequestParam String articleId) throws IOException {
        ApiResponse<DocumentFile> response = ApiResponse.<DocumentFile>builder()
                .status(200)
                .message("Inserted Successfully.")
                .payload(fileService.fileUpload(imageFile, articleId))
                .date(LocalDateTime.now())
                .build();
        return ResponseEntity.ok(response);
    }

    @GetMapping("/view_image")
    public ResponseEntity<?> fileUpload(@RequestParam String fileName) throws IOException {
        try{
            Path path = Paths.get(file_path + "/" + fileName);
            //get and response as image
            Resource file = new ByteArrayResource(Files.readAllBytes(path));
            return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(file);
        }catch (Exception e){
            throw new NotFoundExceptionClass("this file isn't exist.");
        }
    }

    @GetMapping("/list_article_img")
    public ResponseEntity<ApiResponse> fileList(@RequestParam String articleId) throws IOException {
        ApiResponse<List<DocumentFile>> response = ApiResponse.<List<DocumentFile>>builder()
                .status(200)
                .message("Inserted Successfully.")
                .payload(fileService.fileList(articleId))
                .date(LocalDateTime.now())
                .build();
        return ResponseEntity.ok(response);
    }
}
