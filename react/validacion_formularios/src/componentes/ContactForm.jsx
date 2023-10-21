import React from "react";
import { useForm } from "../hooks/useForm";
import Loader from "./Loader";
import Message from "./Message";

const initialForm = {
  name: "",
  email: "",
  subject: "",
  comments: "",
};

const validationsForm = (form) => {
  let errors = {};
  //expreciones regulares para validar el tipo de entra del formato
  //esta exprecion acepta letras minusculas y mayusculas y algunos caracteres
  let regexName = /^[A-Za-zÑñÁáÉéÍíÓóÚúÜü\s]+$/;
  //esta valida que correo electronico sea valido
  let regexEmail = /^(\w+[/./-]?){1,}@[a-z]+[/.]\w{2,}$/;
  //esta valida que los caracteres de la caja de comentarios se de  1 a 255
  let regexComments = /^.{1,255}$/;

  if (!form.name.trim()) {
    errors.name = "el campo nombre es requerido";
  } else if (!regexName.test(form.name.trim())) {
    errors.name = "el campo letra solo aepta letras y espacios en blanco";
  }

  if (!form.email.trim()) {
    errors.email = "el campo email es requerido";
  } else if (!regexEmail.test(form.email.trim())) {
    errors.email = "el campo email es incorrecto";
  }

  if (!form.subject.trim()) {
    errors.subject = "el campo asunto a tratar es requerido";

    if (!form.comments.trim()) {
      errors.comments = "el campo comentarios es requerido";
    } else if (!regexComments.test(form.comments.trim())) {
      errors.comments =
        "el campo comentarios no debe exceder los 255 caracteres";
    }
  }
  return errors;
};

let styles = {
  fontWeight: "bold",
  color: "#dc3545",
};

const ContactForm = () => {
  const {
    form,
    errors,
    loading,
    response,
    handleChange,
    handleBlur,
    handleSubmit,
  } = useForm(initialForm, validationsForm);
  return (
    <div>
      <h2>Formulario de contacto</h2>
      <form onSubmit={handleSubmit}>
        <input
          type="text"
          name="name"
          placeholder="Escribe tu nombre"
          onBlur={handleBlur}
          onChange={handleChange}
          value={form.name}
          required
        />
        {errors.name && <p style={styles}>{errors.name}</p>}

        <input
          type="email"
          name="email"
          placeholder="Escribe tu email"
          onBlur={handleBlur}
          onChange={handleChange}
          value={form.email}
          required
        />
        {errors.email && <p style={styles}>{errors.email}</p>}

        <input
          type="text"
          name="subject"
          placeholder="Asunto a tratar"
          onBlur={handleBlur}
          onChange={handleChange}
          value={form.subject}
          required
        />
        {errors.subject && <p style={styles}>{errors.subject}</p>}

        <textarea
          name="comments"
          cols="20"
          rows="5"
          placeholder="Escribe tus comentarios"
          onBlur={handleBlur}
          onChange={handleChange}
          value={form.comments}
          required></textarea>
        {errors.comments && <p style={styles}>{errors.comments}</p>}
        <input type="submit" value="Enviar" />
      </form>
      {loading && <Loader />}
      {response && (
        <Message msg="Los datos han sido enviados" bgColor="#198754" />
      )}
    </div>
  );
};

export default ContactForm;
