package mx.ipn.cic.eleven.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.eleven.entities.UserEntity;
import mx.ipn.cic.eleven.repositories.IUserRepository;

@Service
public class UserService {

	@Autowired
	private IUserRepository userRepository;

	public List<UserEntity> allUsers() {
		return this.userRepository.findAll();
	}

	public UserEntity register(UserEntity user) {
		return this.userRepository.save(user);
	}

	public UserEntity findById(Integer id) {
		Optional<UserEntity> found = this.userRepository.findById(id);
		try {
			return found.get();
		} catch (NoSuchElementException e) {
			System.out.println("No se encontró el elemento");
		}
		return null;
	}

	public boolean findByUserNameAndPassword(UserEntity user) {
		UserEntity found = this.userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(found != null) {
			return true;			
		}
		return false;
	}

	public UserEntity edit(Integer id) {
		Optional<UserEntity> found = this.userRepository.findById(id);
		try {
			return found.get();
		}
		catch (NoSuchElementException e) {
			System.out.println("Elemento no encontrado");
		}
		return null;
	}

	public boolean delete(Integer id) {
		this.userRepository.deleteById(id);
		return true;
	}
}
