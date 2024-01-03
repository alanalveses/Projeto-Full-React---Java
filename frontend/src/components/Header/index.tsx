import React from 'react';
import './styles.css'

function Header() {
    return(
        <>
        <header>
            <div className="logo-container">
                <img src="../../assets/img/arlott-star.jpeg" alt="Logo" />
                <h1>Heróis Meta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/alaan1214/">@alaan1214</a>
                </p>
            </div>
        </header>
        </>
    )
}

export default Header

