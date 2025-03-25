package com.example.demo.entity;



//@Entity
public class BPMNProcess {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private String processId;

//    @Lob
//    @JdbcTypeCode(SqlTypes.LONGVARCHAR)
    private String bpmnXML;

}
