package io.jonathanlee.clipboardapijava.service;


import io.jonathanlee.clipboardapijava.model.ApplicationUser;
import io.jonathanlee.clipboardapijava.model.Token;

public interface ApplicationUserService {

  ApplicationUser persistApplicationUser(final ApplicationUser applicationUser);

  ApplicationUser findByRegistrationVerificationToken(final Token token);

  ApplicationUser findByPasswordResetToken(final Token token);

  ApplicationUser enableUser(final ApplicationUser applicationUser);

  void deleteDisabledApplicationUserByEmail(final String email);

  void deleteApplicationUser(final ApplicationUser applicationUser);

}
