package com.vinayGahane.lovable_clone.controller;


import com.vinayGahane.lovable_clone.dto.auth.AuthResponse;
import com.vinayGahane.lovable_clone.dto.auth.LoginRequest;
import com.vinayGahane.lovable_clone.dto.auth.SignupRequest;
import com.vinayGahane.lovable_clone.dto.auth.UserProfileResponse;
import com.vinayGahane.lovable_clone.service.AuthService;
import com.vinayGahane.lovable_clone.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;
    private final UserService userService;

   @PostMapping("/signup")
    public ResponseEntity<AuthResponse> signUp(@RequestBody SignupRequest signupRequest){
        return ResponseEntity.ok(authService.signup(signupRequest));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody LoginRequest loginRequest){
       return ResponseEntity.ok(authService.login(loginRequest));
    }

    @GetMapping("/me")
    public ResponseEntity<UserProfileResponse> getProfile(){
       Long userId = 1L;
       return ResponseEntity.ok(userService.getProfile(userId));
    }

}
