package ru.tsystems.tchallenge.service.utility.mail;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateMailInvoice {

    private final String email;
    private final String subject;
    private final String templateName;
    private final Object data;
}
