package com.crypto.world.user_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "user_preferences")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPref {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "interested_coin", nullable = false)
    private String interestedCoin; // e.g. Bitcoin, Ethereum, etc.

    @Column(name = "risk_level", nullable = false)
    private String risk; // high / medium / low

    @Column(name = "investment_period", nullable = false)
    private String period; // short-term / long-term

    @Column(name = "budget", nullable = false)
    private String budget; // e.g. "10000"

    @OneToOne(mappedBy = "preferences")
    private User user;
}
