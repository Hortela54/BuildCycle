package com.example.myapplication;

public class Componentes {
    //objetivo
    static String terreno;
    static String distancia;
    static String objetivo;
    //Medidas
    static double topMesa;
    static double quadroSpeed;
    static double quadroMTB;
    static double selim;

    public void Calculo() {
        if (terreno == "estrada de chão" || terreno == "misto") {
            if (distancia == "leve" && objetivo == "locomoção") {
                /*
                21 ou 24 velocidades
                //Grupos Shimano Tourney ou X-Time
                //Freio a disco mecânico
                //Suspensão a mola simples
                */
            } else if (distancia == "leve" && objetivo == "esporte" || distancia == "medio" && objetivo == "locomoção") {
                /*
                21 ou 24 velocidades
                Grupos Shimano Tourney
                Freio a disco hidráulico
                Suspensão a mola com trava
                */
            } else if (distancia == "medio" && objetivo == "esporte" || distancia == "leve" && objetivo == "treino") {
                /*
                18, 27 ou 12 velocidades
                Grupos Shimano Acera, Shimano Alivio ou Sram SX
                Freio hidráulico
                Suspensão a mola com trava
                */
            } else if (distancia == "medio" && objetivo == "treino") {
                /*
                11 ou 12 velocidades
                Grupos Shimano Deore, Shimano SLX, Sram NX ou Sram GX
                Freio Hidráulico
                Suspensão hidráulica
                */
            } else if (distancia == "alto" && objetivo == "locomoção") {
                /*
                18, 27 ou 12 velocidades
                Grupos Shimano Acera, Shimano Alivio ou Sram SX
                Freio hidráulico
                Suspensão a mola com trava
                */
            } else if (distancia == "alto" && objetivo == "esporte") {
               /*
                11 ou 12 velocidades
                Grupos Shimano Deore, Shimano SLX, Sram NX ou Sram GX
                Freio Hidráulico
                Suspensão hidráulica
                */
            } else if (distancia == "alto" && objetivo == "treino") {
               /*
                11 ou 12 velocidades
                Grupos Shimano XT, Shimano XTR, Sram XG1 ou Sram XX1
                Freio hidráulico
                Suspensão hidráulica
                */
            }
        } else {
            if (distancia == "leve" && objetivo == "locomoção") {
                /*
                14, 21 velocidades
                Shimano Tourney
                Freio a disco mecânico ou ferradura
                Garfo rígido alumínio
                 */
            } else if (distancia == "leve" && objetivo == "esporte" || distancia == "medio" && objetivo == "locomoção") {
                /*
                16 velocidades
                Shimano Claris
                Freio a disco mecânico ou ferradura
                Garfo rígido de alumínio
                */
            } else if (distancia == "medio" && objetivo == "esporte" || distancia == "leve" && objetivo == "treino") {
                /*
                18, 11 velocidades
                Shimano Sora ou Sram Apex
                Freio ferradura ou a disco hidráulico
                Garfo rígido de alumínio
                 */

            } else if (distancia == "medio" && objetivo == "treino") {
                /*
                10, 20 velocidades
                Shimano Tiagra ou Sram Apex
                Freio a disco hidráulico
                Garfo rígido de carbono
                 */

            } else if (distancia == "alto" && objetivo == "locomoção") {
                /*18, 11 velocidades
                Shimano Sora ou Sram Apex
                Freio ferradura ou a disco hidráulico
                Garfo rígido de alumínio
                */

            } else if (distancia == "alto" && objetivo == "esporte") {
                /*10, 20 velocidades
                Shimano Tiagra ou Sram Apex
                Freio ferradura a disco hidráulico
                Garfo rígido de carbono
                */

            } else if (distancia == "alto" && objetivo == "treino") {
                /*11,12, 22 velocidades
                Shimano Ultegra, Shimano Dura-Ace, Sram Force e Sram Red
                Freio ferradura a disco hidráulico
                Garfo rígido de carbono*/

            }

        }
    }
}