package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Id;

@Entity
@Table(name = "vehiculo")
public class Vehiculo{
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "placa")
	private String placa;
	@Column(name = "marca")
	private String marca;
	@Column(name = "modelo")
	private String modelo;
	@Column(name = "precio")
	private double precio;
	@Column(name = "color")
	private String color;
	@Column(name = "fabricacion")
	private int fabricacion;
	@Column(name = "foto")
	private String foto;
	
	public Vehiculo() {
		
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFabricacion() {
		return fabricacion;
	}

	public void setFabricacion(int fabricacion) {
		this.fabricacion = fabricacion;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
	return "[placa=" + placa + ", Marca=" + marca
	+ ", Modelo=" + modelo + ", Precio=" + precio
	+ ", Color=" + color + ", Fabricacion=" + fabricacion
	+ ", Foto=" + foto + "]";
	}
}
