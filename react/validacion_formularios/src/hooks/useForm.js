import { useState } from "react";
import { helpHttp } from "../helpers/helpHttp";

export const useForm = (initialForm, validateForm) => {
  //Esta variable guarda el estado de formulario
  const [form, setForm] = useState(initialForm);
  //Esta varialble guarda los errores
  const [errors, setErrors] = useState({});
  //esta variable es para saber si se esta cargando el formulario
  const [loading, setLoading] = useState(false);
  //esta varible resibe la respuesta de api FORMSUBMIT
  const [response, setResponse] = useState(null);

  //actualioza el formulario
  const handleChange = (e) => {
    const { name, value } = e.target;

    setForm({
      ...form,
      [name]: value,
    });
  };

  // esta funcion crea una copia del firmulario y lanza un error actualizando la variable setError
  const handleBlur = (e) => {
    handleChange(e);
    setErrors(validateForm(form));
  };

  const handleSubmit = (e) => {
    //con esta funcion permite controlar el envion del formulario con ajax
    e.preventDefault();
    //con esta funcion se validan que no existan errores
    setErrors(validateForm(form));

    //esta validacion es para verificar el objeto errores este vacio para enviarlo
    if (Object.keys(errors).length === 0) {
      alert("enviado formulario");
      setLoading(true);
      helpHttp()
        .post("https://formsubmit.co/ajax/jonatanprimera84@gmail.com", {
          body: form,
          headers: {
            "Content-Type": "application/json",
            Accept: "application/json",
          },
        })
        .then((res) => {
          setLoading(false);
          setResponse(true);
          //con setForm limpia el formulario lugo de enviarlo
          setForm(initialForm);
          setTimeout(() => setResponse(false), 2000);
        });
    } else {
      return;
    }
  };

  return {
    form,
    errors,
    loading,
    response,
    handleChange,
    handleBlur,
    handleSubmit,
  };
};
