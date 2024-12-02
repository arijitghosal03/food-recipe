"use client";

import React, { useEffect, useState } from "react";

export const Recipe = () => {
  const [recipe, setRecipe] = useState(null);

  const fetchRecipe = async () => {
    fetch("http://localhost:8000/recipes", {
      method: "GET",
      headers: {
        "Content-Type": "application/json",
        "access-control-allow-origin": "*",
      },
      cache: "no-cache",
      credentials: "omit",
    })
      .then((response) => {
        return response.json();
      })
      .then((data) => {
        console.log(data);
        setRecipe(data);
      })
      .catch((error) => {
        console.log("Error:", error);
      });
  };

  useEffect(() => {
    fetchRecipe();
  }, []);

  return <div>{recipe?.[0].name}</div>;
};
