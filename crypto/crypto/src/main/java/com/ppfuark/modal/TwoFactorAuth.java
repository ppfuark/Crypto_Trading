package com.ppfuark.modal;

import com.ppfuark.domain.VerificationType;
import jakarta.persistence.Entity;

@Entity
public class TwoFactorAuth {
    private boolean isEnable = false;
    private VerificationType sendTo;
}
