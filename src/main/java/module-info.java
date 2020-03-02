module WhereIGo {
	exports logic.beans;
	exports logic.graphiccontrollers;
	exports logic.controllers;
	exports logic.model;
	exports logic;
	exports logic.dao;
	exports logic.view;

	requires java.desktop;
	requires java.logging;
	requires java.sql;
	requires javafx.base;
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	
	opens logic.beans;
	opens logic.graphiccontrollers;
	opens logic.controllers;
	opens logic.model;
	opens logic;
	opens logic.dao;
	opens logic.view;
}