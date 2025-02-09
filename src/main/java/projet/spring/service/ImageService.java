package projet.spring.service;

import java.io.IOException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import projet.spring.entities.Image;

public interface ImageService {

	Image uplaodImage(MultipartFile file) throws IOException;

	Image getImageDetails(Long id) throws IOException;

	ResponseEntity<byte[]> getImage(Long id) throws IOException;

	void deleteImage(Long id);

	Image uplaodImageIng(MultipartFile file, Long idVet) throws IOException;

	
	List<Image> getImagesParIng(Long ingId);

}
