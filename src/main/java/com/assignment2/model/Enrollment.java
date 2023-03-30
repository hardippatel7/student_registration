package com.assignment2.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="enrollment")
public class Enrollment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="applicationNo")
    private int applicationNo;
    @Column(name="studentId")
    private int studentId;
    @Column(name="programCode")
    private String programCode;
    @Column(name="startDate")
    private LocalDate startDate;
    @Column(name="amountPaid")
    private Double amountPaid;
    @Column(name="status")
    private String status;
}

