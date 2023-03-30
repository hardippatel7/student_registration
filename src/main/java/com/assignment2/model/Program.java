package com.assignment2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="program")
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="programId")
    private int programId;
    @Column(name="programCode", unique = true)
    private String programCode;
    @Column(name="programName")
    private String programName;
    @Column(name="duration")
    private String duration;
    @Column(name="fees")
    private String fees;
}
