package org.example;

import java.awt.*;
import java.util.HashSet;
import java.util.Set;

public class Particle {

    private ParticleType type;
    public float x;
    public float y;
    public float sx;
    public float sy;
    public int links;
    public int linksRed;
    public int linksYellow;
    public int linksGreen;
    public Set<Particle> bonds;

    public Particle(ParticleType type, float x, float y) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.sx = 0;
        this.sy = 0;
        this.links = 0;
        this.linksRed = 0;
        this.linksYellow = 0;
        this.linksGreen = 0;
        this.bonds = new HashSet<>();
    }

    public int getType() {
        return type.type - 1;
    }

    public Color getColor() {
        return type.color;
    }

}
