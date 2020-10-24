package com.isil.jazba.repository;

import org.springframework.data.repository.CrudRepository;
import com.isil.jazba.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
