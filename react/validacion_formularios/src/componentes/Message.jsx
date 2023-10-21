import React from "react";

/*export const Message = ({msg, bgColor}) => {
  let style ={
    padding: "1rem",
    marginBottom: "1rem",
    textAlign: "center",
    color:"#fff",
    fonWeinght: "bold",
    backgroudColor: bgColor,
  }
  return (
    <div style={style}>
        <p>{msg}</p>
    </div>
  )
}

export default Message*/

const Message = ({ msg, bgColor }) => {
  let styles = {
    padding: "1rem",
    marginBottom: "1rem",
    textAlign: "center",
    color: "#fff",
    fontWeight: "bold",
    backgroundColor: bgColor,
  };

  return (
    <div style={styles}>
      {/* <p>{msg}</p> */}
      <p dangerouslySetInnerHTML={{ __html: msg }} />
    </div>
  );
};

export default Message;
