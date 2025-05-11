package com.jaberrantisi.userservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Builder
@Setter
@Getter
@AllArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID user_id;

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String email;

    @NonNull
    @Column(name = "first_name")
    private String firstName;

    @NonNull
    @Column(name = "last_name")
    private String lastName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate birthDate;

    @Column(name = "user_role")
    private Role role;
    @Column(name = "created_at")
    private LocalDateTime timeCreated;

    @Column(name = "updated_at")
    private LocalDateTime timeUpdated;






}


